import time


class SampleClass:
  """
    Just a sample class that does nothing
  """

  def __init__(self, temp_arg: str = '') -> None:
    super().__init__()
    self.__temp_arg = temp_arg
    self.y = 5
    self.true = True

  @property
  def temp_arg(self) -> str:
    return self.__temp_arg

  @temp_arg.setter
  def temp_arg(self, new_temp_arg: str) -> None:
    self.__temp_arg = new_temp_arg


def hello_world() -> None:
  # just a random hello world function
  print("hello world")


if __name__ == "__main__":
  x = SampleClass(temp_arg='something')
  hello_world()
  print("done")
