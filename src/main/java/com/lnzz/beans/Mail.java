package com.lnzz.beans;

import lombok.*;

import java.util.Set;

/**
 * ClassName：Mail
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/31 16:24
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mail {

    private String subject;

    private String message;

    private Set<String> receivers;
}