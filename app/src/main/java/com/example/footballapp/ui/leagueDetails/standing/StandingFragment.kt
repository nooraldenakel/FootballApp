package com.example.footballapp.ui.leagueDetails.standing

import android.os.Bundle
import com.example.footballapp.R
import com.example.footballapp.databinding.FragmentStandingBinding
import com.example.footballapp.ui.base.BaseFragment
import com.example.footballapp.ui.leagueDetails.LeagueDetailsFragmentDirections
import com.example.footballapp.util.Constant
import com.example.footballapp.util.OnClickListener

class StandingFragment() :
    BaseFragment<FragmentStandingBinding, StandingViewModel>(R.layout.fragment_standing),
    OnClickListener {

    override fun setup() {
        val standingAdapter = StandingAdapter(emptyList(), this)
        binding.leagueRecycler.adapter = standingAdapter
    }

    override fun onStart() {
        super.onStart()
        binding.viewModel = StandingViewModel(arguments?.getInt(Constant.LEAGUE_ID_KEY))
    }

    override fun getViewModel() = StandingViewModel::class.java
    override fun onClickItem(id: Int, teamId: Int?, leagueId: Int?) {
        navigate(
            LeagueDetailsFragmentDirections.actionLeagueDetailsFragmentToClubDetailsFragment(
                teamId = teamId!!,
                leagueId = arguments?.getInt(Constant.LEAGUE_ID_KEY)!!
            )
        )
    }

    override val arg: Int?
        get() = null
    override val leagueId: Int?
        get() = null
    override val teamId: Int?
        get() = null

    companion object {
        fun newInstance(leagueId: Int?): StandingFragment =
            StandingFragment().apply {
                arguments = Bundle().apply {
                    if (leagueId != null) {
                        putInt(Constant.LEAGUE_ID_KEY, leagueId)
                    }
                }
            }
    }

}
