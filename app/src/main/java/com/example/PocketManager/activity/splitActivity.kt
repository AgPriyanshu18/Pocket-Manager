package com.example.PocketManager.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.PocketManager.Firebase.FirestoreClass
import com.example.PocketManager.R
import com.example.PocketManager.databinding.ActivitySplitBinding
import com.example.PocketManager.fragments.splitFragmentFriend

class splitActivity : AppCompatActivity() {
    var binding : ActivitySplitBinding?= null
    val bundle=Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplitBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        var man = supportFragmentManager

        FirestoreClass().getFriends(this)

        var friend = splitFragmentFriend()

        man
            .beginTransaction()
            .replace(R.id.fragment_split_view, friend)
            .commit()
    }



}