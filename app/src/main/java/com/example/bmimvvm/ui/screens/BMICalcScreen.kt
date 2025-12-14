package com.example.bmimvvm.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bmimvvm.ui.components.HeaderText
import com.example.bmimvvm.ui.components.InputField
import com.example.bmimvvm.viewmodels.BMIViewModel

@Composable
fun BMICalcScreen(modifier: Modifier = Modifier, viewModel: BMIViewModel) {
    Column(modifier = modifier) {
        HeaderText("BMI Calculator")

        InputField(
            label = "Weight",
            value = viewModel.weight,
            onValueChange = viewModel::onWeightChange
        )

        InputField(
            label = "Height",
            value = viewModel.height,
            onValueChange = viewModel::onHeightChange
        )

        Text(
            text = "Your BMI is " + String.format("%.1f", viewModel.getResult()),
            modifier = Modifier.padding(8.dp)
        )
    }
}