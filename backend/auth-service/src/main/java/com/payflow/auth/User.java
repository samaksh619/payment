package com.payflow.auth; import jakarta.persistence.*;
@Entity @Table(name="users") public class User { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id; public String name; @Column(unique=true) public String email; public String password; public String role="CUSTOMER"; public User(){} }
