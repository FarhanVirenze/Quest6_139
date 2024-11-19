package com.pam.quest6_139.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pam.quest6_139.R
import com.pam.quest6_139.ui.model.Mahasiswa
import com.pam.quest6_139.ui.view.screen.part.NavUniv

//@Preview(showBackground = true)
@Composable
fun TampilView(
    uiState: Mahasiswa,
    onBackButtonClicked: () -> Unit = {},
    onResetButtonClicked: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NavUniv()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "Nim:",
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                        fontSize = androidx.compose.ui.unit.TextUnit.Unspecified
                    )
                    Text(
                        text = uiState.nim,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                    )
                    Text(
                        text = "Nama:",
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                    )
                    Text(
                        text = uiState.nama,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                    )
                }
                Column {
                    Text(
                        text = uiState.email,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Matakuliah yang diambil:",
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                )
                Text(
                    text = uiState.namaMatakuliah,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
                Row {
                    Text(
                        text = "Kelas:",
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                    )
                    Text(
                        text = uiState.kelas,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                    )
                }
            }
            Spacer(modifier = Modifier.padding(32.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { onBackButtonClicked() }) {
                    Text(
                        text = "Kembali",
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
                    )
                }
                Button(onClick = { onResetButtonClicked() }) {
                    Text(
                        text = "Reset",
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
                    )
                }
            }
        }
    }
}
