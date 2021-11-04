package com.example.footballapp.ui.home.allMatchScheduled

import com.example.footballapp.R
import com.example.footballapp.model.response.matchScheduled.MatchScheduledInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.util.OnClickListener

class AllMatchAdapter(items: List<MatchScheduledInfo>, listener: OnClickListener) :
    BaseAdapter<MatchScheduledInfo>(items,listener, R.layout.all_match_scheduled_item)