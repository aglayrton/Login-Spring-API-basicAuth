package com.login.sistema.controllers;

import com.login.sistema.dto.DataProfileDto;
import com.login.sistema.dto.UserDto;
import com.login.sistema.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public ResponseEntity<String> test(){
    return new ResponseEntity<String>("teste", HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<UserDto> save(@RequestBody @Valid UserDto userDto){
    UserDto user =  userService.save(userDto);
    return ResponseEntity.ok(user);
  }

}
