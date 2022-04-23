package com.familytask.core.service.impl;

import com.familytask.core.repository.FamilyMemberRepository;
import com.familytask.core.repository.FamilyRepository;
import com.familytask.core.service.FamilyMemberService;
import com.familytask.core.service.FamilyService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class FamilyMemberServiceImpl implements FamilyMemberService {

    private final FamilyMemberRepository familyMemberRepository;

}
