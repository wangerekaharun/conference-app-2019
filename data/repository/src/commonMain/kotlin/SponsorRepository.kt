package io.github.droidkaigi.confsched2019.data.repository

import io.github.droidkaigi.confsched2019.model.Sponsor
import io.github.droidkaigi.confsched2019.model.SponsorCategory
import kotlinx.coroutines.channels.ReceiveChannel

interface SponsorRepository {
    suspend fun sponsors(): List<SponsorCategory>
    suspend fun refresh()
}
