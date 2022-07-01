package com.example.a7_minute_workout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()

        val jumpRope = ExerciseModel(
            1,
            "Jump Rope",
            R.drawable.exercicio1,
            false,
            false
        )
        val meditation = ExerciseModel(
            2,
            "Meditation",
            R.drawable.exercicio2,
            false,
            false
        )
        val tennis = ExerciseModel(
            3,
            "Tennis",
            R.drawable.exercicio3,
            false,
            false
        )
              val stretching = ExerciseModel(
            4,
            "Stretching",
            R.drawable.exercicio4,
            false,
            false
        )
        val bar = ExerciseModel(
            5,
            "Bar",
            R.drawable.exercicio5,
            false,
            false
        )
        val runningMachine = ExerciseModel(
            6,
            "Running Machine",
            R.drawable.exercicio6,
            false,
            false
        )
        val hulaHoop = ExerciseModel(
            6,
            "Hula Hoop",
            R.drawable.exercicio7,
            false,
            false
        )

        exerciseList.add(jumpRope)
        exerciseList.add(tennis)
        exerciseList.add(meditation)
        exerciseList.add(stretching)
        exerciseList.add(bar)
        exerciseList.add(runningMachine)
        exerciseList.add(hulaHoop)

        return exerciseList
    }
}