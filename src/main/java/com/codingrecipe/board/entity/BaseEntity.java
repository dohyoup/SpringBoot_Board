package com.codingrecipe.board.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp // 생성됐을 때 시간 정보를 만들어줌
    @Column(updatable = false)// 수정시엔 관여 안하게
    private LocalDateTime createdTime;

    @UpdateTimestamp // 업데이트됐을 때 시간 정보를 만들어줌
    @Column(insertable = false) // 인서트시에는 관여 안하게
    private LocalDateTime updatedTime;
}
