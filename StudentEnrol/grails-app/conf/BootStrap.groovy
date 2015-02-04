import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

		def leader1=new Leader(fullName:'Dr Anna Roberts',
					post:'Senior Lecturer',
					subject:'Animation',
					email:'a.d.roberts@theUni.ac.uk',
					office:'Room 1234',
					bio:'''jksdfkjdsf ''').save()
		
		def lect1 = new Lecturer( name:'Dr Steve Crossbar',
					     post:'Lecturer',
					     email:'s.h.crossbar@theUni.ac.uk',
					     department:'Computing',
					     subject:'Web Design',
					     research:'Knowledge Management').save()
		
		def course1= new Course( title:'Interactive Media with Animation',
					department:'Computing',
					description:''' lorem ipsum....''',
				leader:Leader.findByFullName('Dr Anna Roberts'),
					code: 'IMA101',
					startDate: new Date('19/01/2015'),
					endDate: new Date('19/01/2020'))

	if(!course1.save()){
			course1.errors.allErrors.each{ error ->
		println "An error occurred whilst creating course1:${error}"

		

		}
    }

	course1.addToLecturers(lect1)
    }
    def destroy = {
    }
}
