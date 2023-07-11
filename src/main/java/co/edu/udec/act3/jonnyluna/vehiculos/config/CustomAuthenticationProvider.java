package co.edu.udec.act3.jonnyluna.vehiculos.config;

import co.edu.udec.act3.jonnyluna.vehiculos.business.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private UserLoginService userLoginService;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        // Obtiene el nombre de usuario proporcionado en la autenticación
        String username = authentication.getName();

        // Carga los detalles del usuario utilizando el UserDetailsService personalizado
        UserDetails userDetails = userLoginService.loadUserByUsername(username);

        // Retorna una instancia de Authentication con los detalles del usuario y los roles
        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
