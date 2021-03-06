package com.loyer.storytracking.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.loyer.storytracking.R
import com.loyer.storytracking.model.User
import com.loyer.storytracking.model.UserStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UserStore.loadUsers(this)

        adapter = UserAdapter(UserStore.getUsers() as MutableList, userOnClick, packageName)
        rvUser.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvUser.adapter = adapter
    }

    private val userOnClick = object : UserAdapter.IUserOnClick {
        override fun onClickUser(position: Int, user: User) {

        }
    }

}
