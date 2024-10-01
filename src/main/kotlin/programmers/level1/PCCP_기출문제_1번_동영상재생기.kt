package programmers.level1

class PCCP_기출문제_1번_동영상재생기 {
    fun solution(
        video_len: String,
        pos: String,
        op_start: String,
        op_end: String,
        commands: Array<String>
    ): String {
        var answer: String
        val openingStartPoint = convertToSeconds(op_start)
        val openingEndPoint = convertToSeconds(op_end)
        val videoEndPoint = convertToSeconds(video_len)
        var current = convertToSeconds(pos)

        // 오프닝 체크
        if (current in openingStartPoint..openingEndPoint) {
            current = openingEndPoint
        }

        // 명령어 순회
        commands.forEach { command ->
            // 10초 이전
            if (command == "prev") {
                current -= 10
                if (current < 0) {
                    current = 0
                }
            }

            // 10초 다음
            if (command == "next") {
                current += 10
                if (videoEndPoint < current) {
                    current = videoEndPoint
                }
            }

            // 오프닝 체크
            if (current in openingStartPoint..openingEndPoint) {
                current = openingEndPoint
            }
        }

        val mm = current / 60
        val ss = current % 60
        answer = if (mm < 10) {
            "0$mm"
        } else {
            "$mm"
        }
        answer += if (ss < 10) {
            ":0$ss"
        } else {
            ":$ss"
        }
        return answer
    }

    private fun convertToSeconds(mmss: String): Int =
        mmss.split(":")
            .map { it.toInt() }
            .reduce { x, y -> x * 60 + y }
}