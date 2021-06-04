package com.todolist.demo.service;

import com.todolist.demo.domain.TodoGroup;
import com.todolist.demo.repository.TodoGroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TodoGroupService {

    private final TodoGroupRepository groupRepository;

    public TodoGroupService(TodoGroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    // 그룹 생성
    @Transactional
    public Long createGroup(TodoGroup group) {
        validateDuplicateGroup(group);
        groupRepository.save(group);

        return group.getId();
    }

    private void validateDuplicateGroup(TodoGroup group) {
        // EXCEPTION
        List<TodoGroup> findGroups = groupRepository.findGroupByName(group.getName());

        if(!findGroups.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 그룹명입니다.");
        }

    }

    // 폴더 전체 조회


}
