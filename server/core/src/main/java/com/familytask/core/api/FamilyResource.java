package com.familytask.core.api;

import com.familytask.core.service.FamilyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/family")
@RequiredArgsConstructor
@Slf4j
public class FamilyResource {

    private final FamilyService familyService;

}
