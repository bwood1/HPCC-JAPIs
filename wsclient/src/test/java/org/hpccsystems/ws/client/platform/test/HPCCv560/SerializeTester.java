package org.hpccsystems.ws.client.platform.test.HPCCv560;

import java.io.*;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.utils.FileFormat;
import org.hpccsystems.ws.client.platform.EclRecordInfo;

public class SerializeTester {

	public static void main(String[] args) {
		
		try
		{
			String address  = "";
			String username = "";
			String password = "";
			
			String dataset  = "";
			String cluster  = "";
			
			Platform platform = Platform.get("http", address, 8010, username, password);
			HPCCWsDFUClient client = platform.getWsDfuClient();

			EclRecordInfo eri = client.getDatasetFields(dataset, cluster, null);
			EclRecordInfo eri_deserialized = null;

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serializetester.ser"));
			out.writeObject(eri);
			out.close();

			eri.setOriginalEcl("I love candy canes");
			eri.setFileType(FileFormat.CSV);

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("serializetester.ser"));
			eri_deserialized = (EclRecordInfo) in.readObject();
			in.close();

			System.out.println("Original Object");
			System.out.println("FileType: " + eri.getFileType());
			System.out.println("Original ECL: " + eri.getOriginalEcl());
			System.out.println("Record Sets: " + eri.getRecordsets());
			System.out.println("-------------------");
			System.out.println("Deserialized Object");
			System.out.println("FileType: " + eri_deserialized.getFileType());
			System.out.println("Original ECL: " + eri_deserialized.getOriginalEcl());
			System.out.println("Record Sets: " + eri_deserialized.getRecordsets());
			
		} catch(IOException i)
		{
			i.printStackTrace();
		} catch(ClassNotFoundException c)
		{
			System.out.println("Class not found");
			c.printStackTrace();
		} catch(Exception e)
		{
			e.getMessage();
			e.printStackTrace();
		}
		

	}
}