package com.RedColem.RedColem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Usar BCrypt para codificar las contraseñas
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // Deshabilitar CSRF ya que estamos trabajando con una API
                .authorizeHttpRequests()
                .requestMatchers("/api/usuarios").authenticated()  // Requiere autenticación para "/api/usuarios"
                .anyRequest().permitAll()  // Las demás rutas están permitidas sin autenticación
                .and()
                .httpBasic(); // Usar autenticación básica (cabeceras Authorization: Basic)

        return http.build(); // Construir el filtro de seguridad
    }
}
