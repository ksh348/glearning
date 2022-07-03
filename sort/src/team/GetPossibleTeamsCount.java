package team;

import sort.MergeSort;

public class GetPossibleTeamsCount {

	public static int getTeamsCount(int[] coutryReps, int teamSize)
	{
		int tempK =0;
		int rtnValue = 0;

		if(coutryReps == null || coutryReps.length == 0 || coutryReps.length < teamSize)
		{
			return rtnValue;
		}

		int tempArr[] = new int[coutryReps.length];

		for(int i = 0 ;i < tempArr.length ; ++i)
		{
			tempArr[i] = coutryReps[i];
		}

		MergeSort mergeSort = new MergeSort();
		mergeSort.sortDsc(tempArr, 0, tempArr.length-1);

		int index=0; 
		while(tempK <  teamSize)
		{
			--tempArr[index];
			
			if(tempArr[index] >= 0)
			{
				++tempK;
			}
			index++;
			if(tempK == teamSize) {
				tempK=0;
				rtnValue++;
				index = 0;
			}

			if(index == tempArr.length && tempK < teamSize)
				break;

		}

		return rtnValue;
	}

	public static void main(String[] args)
	{
		int[] coutryReps = new int[] {3, 5, 3, 7};

		int teamSize = 3;

		System.out.println(getTeamsCount(coutryReps, teamSize));

	}
}