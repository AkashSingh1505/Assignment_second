package com.akash.assignment_second.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akash.assignment_second.R


class BlankFragment : Fragment() {
    var recyclerView: RecyclerView? = null
    var noti_list: ArrayList<NotificationCard_modelClass> = ArrayList<NotificationCard_modelClass>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val  view = inflater.inflate(R.layout.fragment_blank, container, false)

        recyclerView = view.findViewById<RecyclerView>(R.id.notification_recycler_id)
        recyclerView!!.layoutManager = LinearLayoutManager(this.requireContext())
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))
        noti_list.add(NotificationCard_modelClass("Akash", "this is demo content"))


        val adapter = NotificationRecycleViewAdapter(this.requireContext(), noti_list)
        recyclerView!!.adapter = adapter

        return view
    }

}