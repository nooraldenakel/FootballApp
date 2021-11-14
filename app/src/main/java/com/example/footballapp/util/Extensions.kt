package com.example.footballapp.util

import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.footballapp.R
import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.model.response.lineup.LineupInfo
import com.example.footballapp.model.response.lineup.SubstitutesPlayer
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo

fun List<MatchStatisticInfo?>.toMatchStatistic(): List<MatchResultData?> {
    val result = mutableListOf<MatchResultData?>()
    for (i in 0 until (this[0]?.statistics?.size ?: 0)) {
        result.add(
            MatchResultData(
                this[0]?.statistics?.get(i)?.type,
                this[0]?.statistics?.get(i)?.value,
                this[1]?.statistics?.get(i)?.value
            )
        )
    }
    return result
}

fun List<LineupInfo?>.toPlayerStart(): List<DataPlayer?> {
    val result = mutableListOf<DataPlayer?>()
    for (i in 0 until (this[0]?.playerStartMatch?.size ?: 0)) {
        result.add(
            DataPlayer(
                this[0]?.playerStartMatch?.get(i)?.player?.name,
                this[1]?.playerStartMatch?.get(i)?.player?.name,
                this[0]?.playerStartMatch?.get(i)?.player?.number,
                this[1]?.playerStartMatch?.get(i)?.player?.number,
                this[0]?.playerStartMatch?.get(i)?.player?.position,
                this[1]?.playerStartMatch?.get(i)?.player?.position,
                this[0]?.coach?.name,
                this[1]?.coach?.name,
            )
        )
    }
    return result
}

fun List<LineupInfo?>.toSubstitutes(): List<SubstitutesPlayer?> {
    val result = mutableListOf<SubstitutesPlayer?>()
    for (i in 0 until (this[0]?.substitutes?.size ?: 0)) {
        result.add(
            SubstitutesPlayer(
                this[0]?.substitutes?.get(i)?.player?.name,
                this[1]?.substitutes?.get(i)?.player?.name,
                this[0]?.substitutes?.get(i)?.player?.number,
                this[1]?.substitutes?.get(i)?.player?.number,
            )
        )
    }
    return result
}

fun Fragment.setupRefreshLayout(
    refreshLayout: ScrollChildSwipeRefreshLayout,
    scrollUpChild: View? = null
) {
    refreshLayout.setColorSchemeColors(
        ContextCompat.getColor(requireActivity(), R.color.cardview_dark_background),
        ContextCompat.getColor(requireActivity(), R.color.design_default_color_secondary),
        ContextCompat.getColor(requireActivity(), R.color.design_default_color_primary_dark)
    )

    scrollUpChild?.let{
        refreshLayout.scroll = it
    }
}
