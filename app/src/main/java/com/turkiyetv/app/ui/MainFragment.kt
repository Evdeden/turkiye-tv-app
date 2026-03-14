package com.turkiyetv.app.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.*
import androidx.core.content.ContextCompat
import com.turkiyetv.app.R
import com.turkiyetv.app.model.Channel
import com.turkiyetv.app.player.PlayerActivity

class MainFragment : BrowseSupportFragment() {

    private lateinit var mRowsAdapter: ArrayObjectAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUIElements()
        loadRows()
        setupEventListeners()
    }

    private fun setupUIElements() {
        title = "Türkiye TV"
        headersState = HEADERS_ENABLED
        isHeadersTransitionOnBackEnabled = true
        brandColor = ContextCompat.getColor(requireContext(), R.color.primary_dark)
        searchAffordanceColor = ContextCompat.getColor(requireContext(), R.color.accent)
    }

    private fun loadRows() {
        mRowsAdapter = ArrayObjectAdapter(ListRowPresenter())
        val cardPresenter = CardPresenter()

        val categories = listOf("Ulusal Kanallar", "Haber Kanalları", "Spor Kanalları", "Çocuk Kanalları", "Belgesel Kanalları")
        
        categories.forEachIndexed { index, category ->
            val listRowAdapter = ArrayObjectAdapter(cardPresenter)
            // Mock data for demonstration
            for (i in 1..5) {
                listRowAdapter.add(Channel(
                    id = "$index-$i",
                    name = "$category Kanal $i",
                    category = category,
                    url = "https://example.com/stream.m3u8",
                    logo = "https://example.com/logo.png",
                    description = "Şu anki yayın bilgisi..."
                ))
            }
            val header = HeaderItem(index.toLong(), category)
            mRowsAdapter.add(ListRow(header, listRowAdapter))
        }

        adapter = mRowsAdapter
    }

    private fun setupEventListeners() {
        onItemViewClickedListener = OnItemViewClickedListener { itemViewHolder, item, rowViewHolder, row ->
            if (item is Channel) {
                if (item.isPremium) {
                    // Handle premium logic (official app redirection)
                } else {
                    val intent = Intent(requireContext(), PlayerActivity::class.java).apply {
                        putExtra("CHANNEL_URL", item.url)
                        putExtra("CHANNEL_NAME", item.name)
                    }
                    startActivity(intent)
                }
            }
        }
    }
}
