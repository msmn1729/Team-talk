package com.teamtalk.repositories;

import com.teamtalk.models.Pin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PinRepository extends JpaRepository<Pin, Long> {
}
