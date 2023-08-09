(def ... nil)
(def authors [
	{
		:id  100
		:name "Albert Einstein"
		:interest "Physics"
	}
	{
		:id 200
		:name "Alan Turing"
		:interest "Computer Science"
	}
	{
		:id 300
		:name "Jeff Dean"
		:interest "Programming"
	}
])

(def articles [
	{
		:title "Intro To Science"
		:authors [200 300]
		:likes 3
	}
	{
		:title "Programming Machines"
		:authors [200 300]
		:likes 5
	}
	{
		:title "The Digital Age"
		:authors [300]
		:likes 6
	}
	{
		:title "Quantum Computing"
		:authors [300 100]
		:likes 4
	}
])

; Returns Name Of The Author When Passed A Valid Id
(defn id->name [id]
	(:name (first (filter (fn [author]
		(= id (:id author))) authors))))

; Resolves A List Of Author Ids To Their Names
(defn resolve-ids [ids]
	(map id->name ids))
