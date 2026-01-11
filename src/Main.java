import entities.Audio;
import entities.Image;
import entities.PlayerMulti;
import entities.Video;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PlayerMulti[] file = new PlayerMulti[5];
		System.out.println("file:1)Audio,2)Video,3)Image,4)Video,5)Audio ");
		int selectFile = scan.nextInt();
		System.out.println(selectFile);
		file[0] = new Audio("audio1", 3, 4);
		file[1] = new Video("video1", 3, 2,5);
		file[2] = new Image("image1", 3);
		file[3] = new Video("video2", 2, 1,3);
		file[4] = new Audio("audio2", 3, 4);

		for (int i = 0; i < file.length;i++ ) {
			System.out.println("titolo "+file[i].title+" tipo file: "+file[i].toString());
		}

		switch (selectFile) {
			case 1:
				file[0].play();
				break;
			case 2:

				file[1].play();
				break;
			case 3:

				file[2].play();
				break;
			case 4:

				file[3].play();
				break;
			case 5:

				file[4].play();
				break;
			default:
				String def = "File non trovato.Seleziona un nuovo file";
				System.out.println(def);
		}
	}
}
