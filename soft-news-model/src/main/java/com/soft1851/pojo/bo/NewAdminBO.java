package com.soft1851.pojo.bo;

/**
 * @author xunmi
 * @ClassName NewAdminBO
 * @Description TODO
 * @Date 2020/11/20
 * @Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewAdminBO {
    private String username;
    private String adminName;
    private String password;
    private String confirmPassword;
    private String img64;
    private String faceId;
}


