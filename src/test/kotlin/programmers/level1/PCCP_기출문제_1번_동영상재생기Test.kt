package programmers.level1

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PCCP_기출문제_1번_동영상재생기Test : StringSpec({
    "test1" {
        val videoLen = "34:33"
        val pos = "13:00"
        val opStart = "00:55"
        val opEnd = "02:55"
        val commands = arrayOf("next", "prev")

        val actual = PCCP_기출문제_1번_동영상재생기().solution(
            videoLen,
            pos,
            opStart,
            opEnd,
            commands
        )

        actual shouldBe "13:00"
    }

    "test2" {
        val videoLen = "10:55"
        val pos = "00:05"
        val opStart = "00:15"
        val opEnd = "06:55"
        val commands = arrayOf("prev", "next", "next")

        val actual = PCCP_기출문제_1번_동영상재생기().solution(
            videoLen,
            pos,
            opStart,
            opEnd,
            commands
        )

        actual shouldBe "06:55"
    }

    "test3" {
        val videoLen = "07:22"
        val pos = "04:05"
        val opStart = "00:15"
        val opEnd = "04:07"
        val commands = arrayOf("next")

        val actual = PCCP_기출문제_1번_동영상재생기().solution(
            videoLen,
            pos,
            opStart,
            opEnd,
            commands
        )

        actual shouldBe "04:17"
    }
})