package leetcode.easy

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val parenthesesStandard = mapOf(')' to '(', '}' to '{', ']' to '[')
        val stack = Stack<Char>()

        s.forEach { c ->
            when (c) {
                '(', '{', '[' -> stack.add(c)
                ')', '}', ']' -> {
                    if (stack.isEmpty() || stack.pop() != parenthesesStandard[c]) {
                        return false
                    }
                }

                else -> return false
            }
        }

        if (!stack.isEmpty()) {
            return false
        }
        return true
    }

    fun isValidSimple(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        val simplify = s.replace("()", "")
            .replace("{}", "")
            .replace("[]", "")

        if (simplify == s) {
            return false
        }
        return isValidSimple(simplify)
    }
}