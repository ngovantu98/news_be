package com.vti.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Image;

public interface IImageRepository extends JpaRepository<Image, Integer> {


}
