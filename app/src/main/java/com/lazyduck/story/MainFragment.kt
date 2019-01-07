package com.lazyduck.story


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.lazyduck.story.databinding.FragmentMainContainerBinding
import com.lazyduck.story.di.Injectable
import javax.inject.Inject

/**
 * @author datto
 */
class MainFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var viewModel: MainViewModel
    lateinit var binding: FragmentMainContainerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_container, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(MainViewModel::class.java)
        binding.setLifecycleOwner(viewLifecycleOwner)
    }

}