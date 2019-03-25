
val n = 4
val desks = (0, 0) :: (0, 1) :: Nil
val walls = Nil

def distance(i1: Int, j1: Int,
             i2: Int, j2: Int): Int = {
  math.abs(i1 - i2) + math.abs(j1 - j2)
}

val result = for {
  i <- 0 until n
  j <- 0 until n
  dist = desks
    .map(desk => distance(i, j, desk._1, desk._2))
    .sum
} yield (dist, (i, j))

result.minBy(_._1)