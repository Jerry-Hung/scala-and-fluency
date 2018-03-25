package pioneer.pictures

import pioneer.resource

object PictureProgram extends App {
  // flip a picture horizontally, grayscale it, and rotate it left
  val img = Picture.loadImage(resource("C:/Users/Jerry%20Hung/Desktop/scala-and-fluency-master/target/scala-2.12/classes/image.png"))
  val flip = Picture.flipHorizontal(img)
  val grey = Picture.grayScale(flip)
  val left = Picture.rotateLeft(grey)

  Picture.saveImage(left, "output0", "png")

  // The final picture is now in the top folder of this project's directory,
  // in a file called "output2.png".
}
