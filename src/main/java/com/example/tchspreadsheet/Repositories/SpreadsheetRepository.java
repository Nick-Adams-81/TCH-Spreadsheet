package com.example.tchspreadsheet.Repositories;

import com.example.tchspreadsheet.Models.Spreadsheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpreadsheetRepository extends JpaRepository<Spreadsheet, Long> {
}
