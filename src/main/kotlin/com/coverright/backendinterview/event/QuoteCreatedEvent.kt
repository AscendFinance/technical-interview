package com.coverright.backendinterview.event

import java.util.*

data class QuoteCreatedEvent(
    val quoteId: UUID,
    val userId: UUID,
    val age: Int,
    val type: QuoteType
) {
    enum class QuoteType {
        MEDIGAP, MEDICARE
    }
}