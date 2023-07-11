package co.edu.udec.act3.jonnyluna.vehiculos.business;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.UpdatableVehicleRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.VehiculoRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.UsuarioRepository;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.VehiculoRepository;
import co.edu.udec.act3.jonnyluna.vehiculos.util.Util;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoBusinessImpl implements VehiculoBusiness {
    @Autowired
    private VehiculoRepository vehiculoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    @Transactional
    public Vehiculo agregarVehiculo(VehiculoRequest vehiculoRequest) {
        Usuario usuario = usuarioRepository.buscarPorCedula(vehiculoRequest.getCedulaUsuario());
        Vehiculo vehiculo = Vehiculo.builder()
                .color(vehiculoRequest.getColor())
                .marca(vehiculoRequest.getMarca())
                .categoria(vehiculoRequest.getCategoria())
                .modelo(vehiculoRequest.getModelo())
                .combustible(vehiculoRequest.getCombustible())
                .cilindraje(vehiculoRequest.getCilindraje())
                .kilometros(vehiculoRequest.getKilometros())
                .numPuertas(vehiculoRequest.getNumPuertas())
                .placa(vehiculoRequest.getPlaca())
                .numPuestos(vehiculoRequest.getNumPuestos())
                .version(vehiculoRequest.getVersion())
                .usuario(usuario)
                .build();
        return vehiculoRepository.agregarVehiculo(vehiculo);
    }

    @Override
    public VehiculoResponse consultarPorPlaca(String placa) {
        Vehiculo vehiculo = vehiculoRepository.consultarPorPlaca(placa);
        return Util.mapToVehiculoResponse(vehiculo);
    }

    @Override
    @Transactional
    public Vehiculo editarVehiculo(UpdatableVehicleRequest updatableVehicleRequest) {
        Vehiculo vehiculoAEditar = vehiculoRepository.consultarPorPlaca(updatableVehicleRequest.getPlaca());
        vehiculoAEditar.setPlaca(updatableVehicleRequest.getPlaca());
        vehiculoAEditar.setMarca(updatableVehicleRequest.getMarca());
        vehiculoAEditar.setModelo(updatableVehicleRequest.getModelo());
        vehiculoAEditar.setNumPuestos(updatableVehicleRequest.getNumPuestos());
        vehiculoAEditar.setCilindraje(updatableVehicleRequest.getCilindraje());
        vehiculoAEditar.setColor(updatableVehicleRequest.getColor());
        return vehiculoRepository.editarVehiculo(vehiculoAEditar);
    }

    @Override
    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.listarVehiculos();
    }

    @Override
    @Transactional
    public void eliminarVehiculo(String placa) {
        Vehiculo vehiculo = vehiculoRepository.consultarPorPlaca(placa);
        vehiculoRepository.eliminarVehiculo(vehiculo.getId_vehiculo());
    }
}
