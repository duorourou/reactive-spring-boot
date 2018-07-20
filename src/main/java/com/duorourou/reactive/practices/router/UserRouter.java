package com.duorourou.reactive.practices.router;

import com.duorourou.reactive.practices.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRouter {
    @Autowired
    private UserRepository userRepository;

//    @Bean
//    public RouterFunction<ServerResponse> handle() {
//
//        return nest(path("/users"),
//                route(RequestPredicates.GET("/{name}"),
//                        request -> ok().body(userRepository.findByName(request.pathVariable("name")), User.class))
//                        .andRoute(RequestPredicates.POST("/"),
//                                request -> status(HttpStatus.CREATED)
//                                        .body(fromPublisher(userRepository.insert(request.bodyToMono(User.class)), User.class)))
//        );
//    }
}
