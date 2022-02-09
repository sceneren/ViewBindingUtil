package wiki.scene.viewbinding.util

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import wiki.scene.viewbinding.util.databinding.FragmentMainBinding
import wiki.scene.viewbinding.viewbindingutil.viewBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private val mBinding: FragmentMainBinding by viewBinding()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.tv.text = "Hello world"
    }
}