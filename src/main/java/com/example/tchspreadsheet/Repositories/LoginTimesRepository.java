package com.example.tchspreadsheet.Repositories;

import com.example.tchspreadsheet.Models.LoginTimes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginTimesRepository extends JpaRepository<LoginTimes, Long> {
}
