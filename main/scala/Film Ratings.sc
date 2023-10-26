val age: Integer = 10
val age_ratings = Map(
  4 -> "U",
  8 -> "PG",
  12 -> "12A",
  15 -> "15",
  18 -> "18"
)
val film_ratings: List[String] = List("U", "PG", "12A", "15", "18")

for ((age_limit, rating) <- age_ratings) if ( age >= age_limit) {
  println(rating)
}