package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactivado temporalmente
                .authorizeHttpRequests(auth -> auth
                        // Todo lo que sea estético (CSS, JS, Imágenes)
                        .requestMatchers("/static/**", "/css/**", "/js/**", "/imgs/**").permitAll()
                        // Todas las páginas de acceso libre y sus versiones .html
                        .requestMatchers("/", "/index", "/index.html",
                                "/iniciar-sesion", "/iniciar-sesion.html",
                                "/registro", "/registro.html",
                                "/crear-cuenta", "/autenticacion").permitAll()
                        // Todo lo demás está protegido
                        .anyRequest().authenticated()
                );
        return http.build();
    }

}
