package cn.itcast.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Double money;
}
