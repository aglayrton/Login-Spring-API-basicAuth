package com.login.sistema.service;

import com.login.sistema.dto.DataProfileDto;
import com.login.sistema.dto.UserDto;
import com.login.sistema.entities.DataProfile;
import com.login.sistema.entities.User;
import com.login.sistema.repository.DataProfileRepository;
import com.login.sistema.repository.UserRepository;
import org.springframework.stereotype.Service;

import static java.util.Objects.nonNull;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final DataProfileRepository dataProfileRepository;

    public UserService(UserRepository userRepository, DataProfileRepository dataProfileRepository) {
        this.userRepository = userRepository;
        this.dataProfileRepository = dataProfileRepository;
    }

    public UserDto save(UserDto userDto){
        User user = new User(userDto);
        DataProfile dataProfile;
        if(nonNull(userDto.getDataProfile())){
            dataProfile = new DataProfile(userDto.getDataProfile());
            dataProfile = dataProfileRepository.save(dataProfile);
            user.setDataProfile(dataProfile);
            userDto.setDataProfile(new DataProfileDto(dataProfile));
        }

        user = userRepository.save(user);
        userDto.setUid(user.getUid());
        return userDto;
    }
}

