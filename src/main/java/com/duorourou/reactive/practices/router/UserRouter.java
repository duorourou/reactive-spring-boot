package com.duorourou.reactive.practices.router;

import com.duorourou.reactive.practices.domain.User;
import com.duorourou.reactive.practices.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.path;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class UserRouter {
    @Autowired
    private UserRepository userRepository;

    @Bean
    public RouterFunction<ServerResponse> handle() {

        return nest(path("/users"),
                route(RequestPredicates.GET("/{name}"),
                        request -> ok().body(userRepository.findByName(request.pathVariable("name")), User.class))
        );
    }
}
