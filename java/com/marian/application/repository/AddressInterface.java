package com.marian.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.marian.application.model.AddressInfo;


@Repository
public interface AddressInterface extends JpaRepository<AddressInfo,Integer>{

}
