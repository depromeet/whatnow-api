package com.depromeet.whatnow.domains.promiseprogress.domain

import com.depromeet.whatnow.common.BaseTimeEntity
import javax.persistence.*

@Entity
@Table(name = "tbl_promise_progress")
class PromiseProgress(

    @Enumerated(EnumType.STRING)
    @Column(name = "promise_progress_group")
    var group: PromiseProgressGroup,

    var code: String, // 상태 코드

    var kr: String, // 한글

    var img: String, // 이미지

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promise_progress_id")
    val id: Long? = null,
) : BaseTimeEntity()
