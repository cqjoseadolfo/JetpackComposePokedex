package com.plcoding.jetpackcomposepokedex.data.remote.respondes

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: MoveLearnMethod,
    val version_group: VersionGroup
)