package com.coverright.backendinterview.event

import java.util.*

data class ProfileCreatedEvent(
    val profileId: UUID,
    val userId: UUID,
    val email: String,
    val firstName: String,
    val lastName: String
)