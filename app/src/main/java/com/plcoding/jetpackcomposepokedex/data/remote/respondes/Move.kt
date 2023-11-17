package com.plcoding.jetpackcomposepokedex.data.remote.respondes

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)