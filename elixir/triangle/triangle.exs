defmodule Triangle do
  @type kind :: :equilateral | :isosceles | :scalene

  @doc """
  Return the kind of triangle of a triangle with 'a', 'b' and 'c' as lengths.
  """
  @spec kind(number, number, number) :: { :ok, kind } | { :error, String.t }
  def kind(a, b, c) when a <= 0 or b <= 0 or c <= 0 , do: {:error, "all side lengths must be positive" }
  def kind(a, b, c) when a + b <= c, do: {:error, "side lengths violate triangle inequality" }
  def kind(b, c, a) when a + b <= c, do: {:error, "side lengths violate triangle inequality" }
  def kind(c, a, b) when a + b <= c, do: {:error, "side lengths violate triangle inequality" }
  def kind(a, a, a), do: {:ok, :equilateral}
  def kind(_, a, a), do: {:ok, :isosceles}
  def kind(a, _, a), do: {:ok, :isosceles}
  def kind(a, a, _), do: {:ok, :isosceles}
  def kind(_, _, _), do: {:ok, :scalene}
end
