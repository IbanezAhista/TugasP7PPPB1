import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import ibanez.pppb1.tugasp7pppb1.LoginFragment
import ibanez.pppb1.tugasp7pppb1.RegisterFragment

class SectionsPagerAdapter(activity: AppCompatActivity) :
    FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = RegisterFragment()
            1 -> fragment = LoginFragment()
        }
        return fragment as Fragment
    }

}