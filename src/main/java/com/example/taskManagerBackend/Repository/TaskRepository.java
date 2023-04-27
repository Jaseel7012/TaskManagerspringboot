package com.example.taskManagerBackend.Repository;

import com.example.taskManagerBackend.Model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface TaskRepository extends JpaRepository<TaskModel,Integer> {
    @Query(value = "select t.description,t.due_date,t.priority,t.status,p.age,p.bed,p.facility,p.room,p.name,p.location,p.unit_name from patient_tb p join task_table t on p.id=t.patient_id ",nativeQuery = true)
    public List<Object> listTaasks();
}
